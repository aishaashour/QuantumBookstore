# Quantum Bookstore

Java-based console application simulating an online bookstore.
it supports different type of books(paper,ebook,demo), and operations 
like inventory management, buying, ...etc.

built as part of the Fawry Quantum Internship Challenge. 

# Features
- add new book to inventory(isbn,title,author,year,price, etc.)
- support:
  - paper books: shippable with stock count.
  - Ebooks: deliverable via mail with file type
  - Demo books: not for sale
- Remove outdated books
- Buy books vis isbn, with address nad mail.

# Sample Output
for the main i already provided to test with it.

    'ya rab' Added to inventory.
    'what' Added to inventory.
    'ya kareem' Added to inventory.
    'ya allah' Added to inventory.
    
    Removed outdated book 'what'.
    
    Shipping 2 copy(ies) of ya rab to 6 october city
    ShippingService called for address: 6 october city
    Total paid: 290.0 L.E.
    
    Sending 1 copy(ies) of EBook ya kareem (PDF) to hahaha@hotmail.com
    MailService called for email: hahaha@hotmail.com
    Total paid: 130.0 L.E.
    
    Sorry Demo books are not for sale.
