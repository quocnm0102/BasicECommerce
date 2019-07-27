# Basic Ecommerce

Write a basic eCommerce program that models a User, Product and ShoppingCart. 

## Table of content

- [Installation](#installation)
- [Quickstart](#quickstart)   
- [Examples](#examples)

## Installation

### Using Java 8 or newer versions

Follow install guide in this link:

    https://java.com/en/download/faq/java_win64bit.xml

## Quickstart
You need to create test file with .txt extension.
```
    John Doe
    john.doe@example.com
    Apple
    4.95
    2
    Orange
    3.99
    1
    Apple
    4.95
    -1
```
Template test file:
- line 1: username
- line 2: email
- next-3-line : product name, price, amount (if you want to remove a product, you can add neagtive amount)

I built a jar in **result** directory.
To run this jar with test, type input in cmd with template:
``` cmd
java -jar BasicECommerce.jar [test_file.txt ...]
```

## Examples
``` cmd
java -jar BasicECommerce.jar test.txt
```
``` cmd
java -jar BasicECommerce.jar test.txt test1.txt
```
``` cmd
java -jar BasicECommerce.jar test.txt test2.txt test3.txt
```

