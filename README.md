# 🍕 Pizza Ordering System – DDD, Hexagonal, Specification, Decorator, Factory (Java)

This project demonstrates how to build a modular, testable and extensible Pizza Ordering System using:

- ✅ **Domain-Driven Design (DDD)**
- ✅ **Hexagonal Architecture (Ports & Adapters)**
- ✅ **Specification Pattern** – for composable business rules
- ✅ **Decorator Pattern** – for dynamic topping composition
- ✅ **Factory Pattern** – for clean creation of pizzas
- ✅ **Policy Pattern** – for flexible discount rules

---

## 🧱 Tech Stack

- Java 17+
- Plain Java (no frameworks)
- Fully modular and easy to extend

---

## 📁 Project Structure

/domain └── pizza/ → Pizza interfaces, base, decorators 
└── customer/ → Customer entity, loyalty rule /factory → PizzaFactory /specification → Pizza and customer validation rules /policy → Discount strategies (fixed & percentage) /application → Service layer: order orchestration

## 🧠 Design Principles Used

| Pattern        | Usage                                      |
|----------------|---------------------------------------------|
| Specification  | Validate pizza calories, topping limits     |
| Decorator      | Add toppings like Cheese, Mushrooms         |
| Factory        | Create Margherita or Vegan pizza cleanly    |
| Policy         | Flexible discount logic (based on score)    |

---

## 🚀 How to Run

```bash
javac PizzaOrderService.java
java PizzaOrderService

Ordering: Margherita, Mushrooms, Cheese
Calories: 220
🎉 Discount applied!
✅ Order Accepted! Final Price: €10.39
