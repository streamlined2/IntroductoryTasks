select a.account_id, c.fed_id, p.name from account a inner join customer c on a.cust_id = c.cust_id inner join product p on p.product_cd = a.product_cd where c.cust_type_cd = 'I'