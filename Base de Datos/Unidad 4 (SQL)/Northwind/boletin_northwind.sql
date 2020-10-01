--1.Lista alfabética de productos .(B)
SELECT ProductName FROM products ORDER BY ProductName ASC;

--2.Productos más caros que la media de productos.(B)
SELECT ProductName, UnitPrice FROM products WHERE UnitPrice > (SELECT AVG(UnitPrice) AS Media FROM products);

--3.Subtotales de pedidos: Para cada pedido, calcula un subtotal para cada pedido (identificado por OrderID). 
SELECT O.orders, SUM(P.UnitPrice*OD.quantity) AS Total
FROM 'order details' AS OD
INNER JOIN orders AS O
ON OD.OrderID=P.OrderID
INNER JOIN products P
ON OD.productID=P.ProductID
GROUP BY O.OrderID;

--4.Ventas por año
SELECT YEAR(OrderDate)
ROUND(SUM(UnitPrice*Quantity),0) AS Total,
CONCAT(ROUND(SUM(UnitPrice*Quantity),0),'€')
FROM OrderDetails OD
INNER JOIN Orders O
ON OD.OrderID=O.OrderID
INNER JOIN Products P
ON OD.ProductID=P.ProductID
GROUP BY YEAR(OrderDate);

--5.Ventas de empleados por país. Para cada empleado, obtenga la cantidad de sus ventas, desglosado por nombre de país. 
SELECT E.FirstName, E.LastName, O.ShipCountry AS Pais,
ROUND(SUM(UnitPrice*Quantity),0) AS Total
FROM 'Order Details' OD
INNER JOIN Orders O
ON OD.OrderID=O.OrderID
INNER JOIN Products P
ON OD.ProductID=P.ProductID
INNER JOIN Employees E
ON E.Employees=O.EmployeeID
GROUP BY O.ShipCountry, E.FirstName, E.LastName
ORDER BY O.ShipCountry;

--6.Detalles de los pedidos ampliados. Esta consulta calcula el importe de venta de cada pedido después de aplicar el descuento.
SELECT O.OrderID, ROUND(SUM((P.UnitPrice-P.UnitPrice*OD.Discount)*OD.quantity),2) AS Total
FROM `order details` OD
INNER JOIN orders O ON OD.OrderID=O.OrderID
INNER JOIN products P ON OD.productID=P.ProductID
GROUP BY O.OrderID;

--7.Ventas por categoría. Para cada categoría, obtenemos la lista de productos vendidos y el monto total de ventas.
SELECT C.CategoryName, ROUND(SUM(P.UnitPrice*OD.quantity),2) AS VENTAS
FROM orders O
INNER JOIN `order details` OD ON OD.OrderID=O.OrderID
INNER JOIN products P ON OD.productID=P.ProductID
INNER JOIN categories C ON C.CategoryID=P.CategoryID
GROUP BY C.CategoryName;
 
--8.Diez productos más caros 
Select ProductName, UnitPrice
FROM products 
ORDER BY UnitPrice DESC LIMIT 10;

--9.Ejecuta la siguiente consulta y explica qué datos aporta:
--select City, CompanyName, ContactName, 'Customers' as Relationship 
--from Customers 
--union 
--select City, CompanyName, ContactName, 'Suppliers' 
--from Suppliers order by City, CompanyName;
Lo que hace es unir las dos consultas y depende de la consulta que me salga añade un campo relationship u otro.

--10.Productos vendidos en 1997
SELECT DISTINCT(P.ProductName)
FROM Products P
INNER JOIN `order details` OD ON OD.ProductID=P.ProductID
INNER JOIN orders O ON OD.OrderID=O.OrderID
WHERE YEAR(O.OrderDate)=1997;

--11.Consulta que muestre el producto más caro y el más barato
SELECT P.ProductName,P.UnitPrice
FROM Products P
WHERE P.UnitPrice IN (SELECT MAX(P.UnitPrice) FROM Products P) OR P.UnitPrice IN (SELECT MIN(P.UnitPrice) FROM Products P);

--12.Haz una lista con todos los clientes, junto con los pedidos (OrderId) y fecha en la que se han realizado los pedidos. 
--Incluye los clientes que no han realizado pedidos. 
SELECT C.ContactName AS Cliente, O.OrderID AS Pedido, O.OrderDate AS Fecha
FROM Customers C
INNER JOIN Orders O ON O.CustomerID=C.CustomerID
ORDER BY C.ContactName;

--13.Nombre del cliente que ha realizado más pedidos 
SELECT C.ContactName AS Cliente, Count(*) AS Pedidos
FROM Orders O
INNER JOIN `order details` OD ON O.OrderID=OD.OrderID
INNER JOIN Customers C ON C.CustomerID=O.CustomerID
GROUP BY C.CompanyName
HAVING COUNT(*)>= ALL(SELECT Count(*)
FROM Orders O
INNER JOIN `order details` OD ON O.OrderID=OD.OrderID
INNER JOIN Customers C ON C.CustomerID=O.CustomerID
GROUP BY C.CompanyName);

--14.Pedidos previos a la navidad (del 15 de noviembre al 31 noviembre de cualquier año)
SELECT O.OrderID AS Pedido, O.OrderDate AS Fecha
FROM Orders O
WHERE (DAY(O.OrderDate)>=15 AND MONTH(O.OrderDate)=11)
ORDER BY O.OrderDate;

--15.Cuántos productos hay en cada categoría y precio medio
SELECT C.CategoryName AS Categoria, COUNT(*) AS Elementos, AVG(p.unitprice) AS Precio_Medio
FROM Products P
INNER JOIN Categories C ON C.CategoryID=P.CategoryID
GROUP BY C.CategoryName;

--16.Realizar un listado del tipo: El Producto Té Dharamsala es de la categoría Beverages 
--El Producto Cerveza tibetana Barley es de la categoría Beverages.
SELECT CONCAT('El producto ',P.ProductName,' es de la categoria ',C.CategoryName)
FROM Products P
INNER JOIN Categories C ON C.CategoryID=P.CategoryID
GROUP BY C.CategoryName;

--17.Obtener la lista de los empleados que preparan pedidos para ciudades distintas a las suyas.
SELECT DISTINCT E.FirstName, E.LastName
FROM Employees E
INNER JOIN Orders O
ON O.EmployeeID=E.EmployeeID
WHERE O.ShipCity<>E.City;

--18.Agrupados por categoría, mostrar el número de productos procesados por empleados de EEUU.
SELECT C.CategoryName AS Categoria, COUNT(*) AS Num_Productos
FROM Products P
INNER JOIN Categories C ON C.CategoryID=P.CategoryID
INNER JOIN `order details` OD ON P.ProductID=OD.ProductID
INNER JOIN orders O ON O.OrderID=OD.OrderID
INNER JOIN Employees E ON O.EmployeeID=E.EmployeeID
WHERE E.EmployeeID=(SELECT E.EmployeeID FROM Employees E WHERE E.Country="USA" )
GROUP BY C.CategoryName;

--19.Obtener la lista de los empleados que prepararon pedidos de marzo 
SELECT DISTINCT E.FirstName, E.LastName
FROM Employees E
INNER JOIN Orders O
ON O.EmployeeID=E.EmployeeID
WHERE MONTH(O.ShipDate) = 'MARZO';

--20.Mostrar los meses en los que no hay pedidos
SELECT OrderID, MONTH(OrderDate) FROM orders GROUP BY MONTH(OrderDate) HAVING COUNT(OrderID) = 0;



