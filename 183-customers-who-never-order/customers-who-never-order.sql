/* Write your PL/SQL query statement below */

select name as customers 
from Customers
where id Not IN(
      SELECT customerId
    FROM Orders
);

