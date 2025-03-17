create table orders (
    order_id int auto_increment,
    order_date DATE NOT NULL ,
    client_id int not null ,
    total_amount decimal(10, 2),
    PRIMARY KEY (order_id)

)
