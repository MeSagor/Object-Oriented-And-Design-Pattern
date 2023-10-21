
<h1 align="center">Assignment-5</h1>

## Assignment Branches
**Note:** My assignments are structured in branches as follows:
- **Assignment 1:** Branch `Assignment-1`
- **Assignment 2:** Branch `Assignment-2`
- **Assignment n:** Branch `Assignment-n`

## Problem Statement
Write a Java program to demonstrate the implementation of a proxy pattern for an online retail store with global distribution and warehousing.

## Retail Store Warehouse System

This simple Java application demonstrates a retail store's warehouse system using a proxy pattern. The system allows adding and shipping products to and from the warehouse.

## Classes

### Warehouse

The `Warehouse` interface defines the operations for adding and shipping products. It includes the following methods:

- `shipProduct(String product, int quantity)`: Ships a specified quantity of a product.
- `addProduct(String product, int quantity)`: Adds a specified quantity of a product to the warehouse.

### RealWarehouse

The `RealWarehouse` class implements the `Warehouse` interface and represents the actual warehouse with products in stock. It maintains a `stock` of products in the form of a `HashMap`. It includes the following methods:

- `RealWarehouse()`: Constructor to initialize the `stock`.
- `shipProduct(String product, int quantity)`: Ships a specified quantity of a product, updating the stock.
- `addProduct(String product, int quantity)`: Adds a specified quantity of a product to the warehouse stock.

### WarehouseProxy

The `WarehouseProxy` class also implements the `Warehouse` interface, acting as a proxy for the warehouse. It contains a private field `realWarehouse` and delegates requests to the `RealWarehouse` instance when needed. It includes the following methods:

- `shipProduct(String product, int quantity)`: Ships a specified quantity of a product by first creating a `RealWarehouse` instance if not already available.
- `addProduct(String product, int quantity)`: Adds a specified quantity of a product to the warehouse stock by creating a `RealWarehouse` instance if not already available.

### RetailStore

The `RetailStore` class serves as the entry point for the application. In the `main` method, it demonstrates the use of the warehouse system by adding and shipping products through the `WarehouseProxy`.

### Class diagram
![](images/class_diagram.png)

