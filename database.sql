CREATE USER 'order_user'@'localhost' IDENTIFIED BY 'order123';
GRANT ALL PRIVILEGES ON order_db.* TO 'order_user'@'localhost';
FLUSH PRIVILEGES;
