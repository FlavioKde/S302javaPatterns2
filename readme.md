# 🍕 Java Design Patterns Project: Builder, Observer & Callback

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)
[![OOP](https://img.shields.io/badge/Object--Oriented%20Design-SOLID-blueviolet?style=for-the-badge)](https://en.wikipedia.org/wiki/SOLID)

## 📄 Description

This project demonstrates the implementation of **classic software design patterns** in Java using a modular Gradle structure. Each level focuses on specific patterns with real-world inspired domains such as pizza ordering, stock trading, and payment processing.

---

## 🎯 Learning Objectives

- Understand and apply the **Builder**, **Observer**, and **Callback** design patterns.
- Practice **Dependency Injection** and **SOLID** principles in OOP.
- Simulate real-world system interactions with **interfaces**, **abstractions**, and **reusability**.
- Learn clean separation of concerns and design structure in Java.

---

## 🧱 Technologies Used

- **Java 19+**
- **Gradle**
- **Command Line Execution**
- **IntelliJ IDEA / VSCode** (recommended for editing and running)

---

## 🧪 Project Structure

├── level1.builder # Pizza Builder pattern ├── level2.observer # Stock Agent Observer pattern ├── level3.callback # Payment Gateway Callback simulation └── Main.java # Entry points per level


---

## 💡 Pattern Summaries

### 🏗️ Level 1: Builder Pattern – Pizza Ordering System

- Create customizable pizzas with different **sizes**, **dough types**, and **toppings**.
- Abstract builder interface defines the pizza construction steps.
- Concrete builders like **HawaiianPizzaBuilder** or **VegetarianPizzaBuilder** define specific recipes.
- A director class (e.g. `PizzaMaster`) receives a builder and orchestrates the pizza creation.

🔧 **Key Classes**:
- `Pizza` (Product)
- `PizzaBuilder` (Interface)
- `HawaiianPizzaBuilder`, `VegetarianPizzaBuilder` (Concrete Builders)
- `PizzaMaster` (Director)

---

### 📈 Level 2: Observer Pattern – Stock Market Notifications

- A **StockAgent** (Observable) notifies multiple **StockAgencies** (Observers) when stock prices change.
- Observer pattern ensures **decoupled notification**, letting observers subscribe and respond independently.

🔧 **Key Concepts**:
- `Observable` maintains a list of `Observers`.
- Observers update when the stock rises or falls.
- Follows Java’s own observer model principles.

---

### 💳 Level 3: Callback Pattern – Payment Gateway System

- A **Shoe Store** sends a payment request through a **PaymentHandler**, without knowing the payment details.
- Each **PaymentMethod** is encapsulated and passed in as a **callback**.
- After payment processing, control returns to the store (e.g., to print receipt or confirm order).

🔧 **Highlights**:
- Supports payment methods like **Credit Card**, **PayPal**, **Bank Transfer**.
- Encapsulates logic using interfaces and delegation.
- Uses **inversion of control** to simulate asynchronous callbacks.

---

## 📦 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/java-design-patterns-project.git
   cd java-design-patterns-project

2. **Build the project**

   ```bash
./gradlew build

3. **Run a specific level**

    ```bash
# Builder pattern
./gradlew run --args='builder'

# Observer pattern
./gradlew run --args='observer'

# Callback pattern
./gradlew run --args='callback'

> Alternatively, you can run each level's Main class directly from your IDE.

## 📌 Requirements

Java 19 or higher

Gradle (wrapper included)

Any modern Java IDE (optional, but recommended)

## 🧠 Concepts Practiced

✅ Object-Oriented Design

✅ Interfaces & Polymorphism

✅ Inversion of Control

✅ Delegation

✅ Gradle modular structure

✅ Simulation of real-world processes

## 🤝 Contributions

Contributions are welcome! If you'd like to add more patterns (e.g. Strategy, Singleton), feel free to fork and open a pull request.

## 📚 References
Design Patterns – Gamma et al.

Builder Pattern

Observer Pattern

Callback Mechanism in Java

## Crafted with ☕ and pattern love — keep building!

