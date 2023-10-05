# Hibernate

# A simple Java application demonstrating the usage of Hibernate with MySQL to interact with a database.

# Project Overview

This is a Java application that demonstrates how to use Hibernate, a popular Object-Relational Mapping (ORM) framework, to interact with a MySQL database.
In this project, I created a simple Student entity class and used Hibernate annotations to map it to a corresponding database table. 
We perform basic CRUD operations (Create, Read, Update, Delete) on the Student entity using Hibernate.

# hibernate.cfg.xml
It is the Hibernate configuration file where you specify the database connection details, dialect, and other Hibernate-related properties.

<!-- hibernate.cfg.xml -->
<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
<property name="hibernate.connection.password">YourDatabasePassword</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost/demo</property>
<property name="hibernate.connection.username">root</property>

# Images
<img width="721" alt="image" src="https://github.com/VaishnaviSh14/Hibernate/assets/123576868/525cf7a6-e533-43df-8749-706197a2b63e">

<img width="214" alt="image" src="https://github.com/VaishnaviSh14/Hibernate/assets/123576868/719d3ae7-bb92-4f40-b2d9-1d3bd7c5143a">

