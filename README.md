# shopapi
shop API for SpringBoot assessment
This shop API exposes product, cart , order and customer resources.
product resource lists availale products.
cars resource creates, list carts.
Order resouce creates and lists orders.

product resource:
	/products
	/products/{idProduct}	
Cart Resource:
/carts
/carts{idCart}

Order Resource
/orders
/orders{idCart}

Customer Resource
/customers
/customers{idCustomer}

intial data, products
[
    {
        "idProduct": 1,
        "productType": "Cell phones",
        "description": "iPhone X",
        "price": 234,
        "units": 10
    },
    {
        "idProduct": 2,
        "productType": "Computers ",
        "description": "Dell Latilutde",
        "price": 456,
        "units": 20
    }
]

intial data, Customers
    {
        "lastName": "Abitew",
        "username": "amelaku",
        "orders": [],
        "carts": [],
        "idcustomer": 1
    },
    {
        "lastName": "Adane",
        "username": "amamuna",
        "orders": [],
        "carts": [],
        "idcustomer": 2
    }
]
