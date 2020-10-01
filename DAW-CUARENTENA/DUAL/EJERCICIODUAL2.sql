/*1. Crear un disparador que verifique que la cantidad en stock del producto
sea mayor que cero, que la cantidad de precio de venta sea mínimo un
20% mayor al precio del proveedor y que el precio de venta que se
actualiza sea mayor que el precio de venta antiguo del registro.*/
CREATE OR REPLACE TRIGGER ValidaStock BEFORE INSERT OR UPDATE ON
productos FOR EACH ROW

DECLARE
    not_condicion_insert EXCEPTION;
    not_condicion_update EXCEPTION;
BEGIN
    IF inserting THEN
        IF (:new.cantidadenstock < 0) AND (:new.precioventa < (:new.precioproveedor *1.2)) THEN
            RAISE not_condicion_insert;
        END IF;
    END IF;

    IF updating THEN
        IF :new.precioventa < :old.precioventa THEN
            :new.precioventa := :old.precioventa;
            RAISE not_condicion_update;
        END IF;
    END IF;

    EXCEPTION
        WHEN not_condicion_insert THEN
            DBMS_OUTPUT.PUT_LINE ('El stock es negativo o el precio no cumple el minimo.');
        WHEN not_condicion_update THEN
            DBMS_OUTPUT.PUT_LINE ('No se debe poner un precio menor al antiguo.');
END;
/


/*2. Mostrar el nombre de un cliente dado su código. Controla en caso
de que no se encuentre, mostrando un mensaje por ejemplo.*/
CREATE OR REPLACE PROCEDURE nombre_cliente(v_codigocliente clientes.codigocliente%type)
AS
    v_nombre VARCHAR(45);
BEGIN
  SELECT nombrecliente INTO v_nombre 
  FROM clientes WHERE codigocliente = v_codigocliente;
  DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || v_nombre);
  EXCEPTION
  WHEN no_data_found THEN
        DBMS_OUTPUT.PUT_LINE('EL CLIENTE NO EXISTE');
END;
/
DECLARE
    v_codigo clientes.codigocliente%type := &codigo;
BEGIN
    nombre_cliente(v_codigo);
END;
/


/*3. Realizar una función que me devuelva la suma de pagos que ha
realizado. Pasa el código por parámetro. Controla en caso de que
no se encuentre, en ese caso devuelve un -1.*/
CREATE OR REPLACE FUNCTION pagos_totales(v_codigocliente clientes.codigocliente%type)
RETURN NUMBER
AS
  v_sumapagos pagos.cantidad%type := 0;
BEGIN
  SELECT SUM(cantidad) INTO v_sumapagos
  FROM pagos
  WHERE codigocliente = v_codigocliente;
    RETURN v_sumapagos;

    EXCEPTION
      WHEN no_data_found THEN
            RETURN -1;
END;
/
SELECT PAGOS_TOTALES(1) FROM CLIENTES;
/


/*4. Realizar un método o procedimiento que muestre el total en euros
de un pedido, pásale el código por parámetro. Controla en caso de
que no se encuentre, en ese caso devuelve un 0. Pásale otro
parámetro, si supera ese límite, lanzaremos una excepción propia y
devolveremos un 0.*/
CREATE OR REPLACE FUNCTION TOTAL_PEDIDO (v_codigopedido pedidos.codigopedido%type, v_limite number)
RETURN NUMBER
AS
v_total NUMBER(8) := 0;
limite_superado EXCEPTION;

BEGIN
  SELECT SUM(dp.cantidad * dp.PRECIOUNIDAD) into v_total
  FROM pedidos p, detallepedidos dp
  WHERE p.codigopedido = dp.codigopedido and p.codigopedido = v_codigopedido;
  IF v_total IS NULL THEN
    RAISE no_data_found;
  ELSE
    IF v_limite < v_total THEN
      RAISE limite_superado;
    ELSE
      RETURN v_total;
    END IF;
    END IF;
EXCEPTION
  WHEN no_data_found THEN
    RETURN -1;
  WHEN limite_superado THEN
    DBMS_OUTPUT.PUT_LINE('OVERLIMIT');
    RETURN 0;
END;
/
DECLARE
  v_codigopedido pedidos.codigopedido%type := &codigo;
  v_total NUMBER(8);
  v_limite NUMBER(8) := &limite;
BEGIN
  v_total := total_pedido_func(v_codigopedido , v_limite);
  
  IF v_total = -1 THEN
    DBMS_OUTPUT.PUT_LINE('NOT EXIST');
  ELSE
    DBMS_OUTPUT.PUT_LINE('TOTAL PEDIDO: ' || v_total);
  END IF;
END;
/




