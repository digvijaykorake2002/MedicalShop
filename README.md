# Medical Store Management System

## Project Overview
The **Medical Store Management System** is a web-based application designed to streamline medical store operations by automating inventory management, billing, and customer record-keeping. It helps store owners efficiently track medicine stock, manage sales, and generate invoices.

## Technologies Used
- **Frontend:** HTML, CSS
- **Backend:** Spring Boot
- **Database:** MySQL

## Features
- **User Authentication:** Secure login system for store managers.
- **Inventory Management:** Add, update, and remove medicines from stock.
- **Billing System:** Generate invoices for customer purchases.
- **Stock Alerts:** Notify when stock levels are low.
- **Customer Records:** Maintain purchase history and customer details.
- **Search & Filter:** Easily find medicines and transactions.

## How It Works
1. **User Login:** Store managers log in securely.
2. **Medicine Management:** Medicines can be added, updated, or removed from inventory.
3. **Sales Processing:** Customers purchase medicines, and bills are generated.
4. **Stock Monitoring:** The system alerts when stock is running low.
5. **Report Generation:** View sales records and customer transaction details.

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/medical-store-management-system.git
   ```
2. Configure database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/medicalstore
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. Access at:
   ```
   http://localhost:8080
   ```

---
**Developed by Digvijay Korake**

