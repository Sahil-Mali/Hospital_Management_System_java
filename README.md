# 🏥 Simple Hospital Management System (Java Console Application)

This is a beginner-friendly **Java console-based Hospital Management System** that demonstrates all core **Object-Oriented Programming (OOP)** concepts using **only basic Java** (no ArrayList, no advanced libraries).

---

## ✅ Features

- Add new doctors
- Add new patients
- Book appointments between doctors and patients
- View all doctors, patients, and appointments

---

## 🧠 OOP Concepts Used

| Concept         | Usage in Code                                       |
|------------------|------------------------------------------------------|
| **Encapsulation** | Private fields + Getters & Setters in all classes   |
| **Inheritance**   | `Doctor` and `Patient` classes extend `Person`     |
| **Abstraction**   | Abstract class `Person` with `showDetails()`       |
| **Interface**     | `Treatable` interface implemented by `Doctor`      |
| **Polymorphism**  | Overriding `showDetails()` and `toString()`        |
| **Static**        | Static ID counters and shared scanner              |
| **Final**         | Final fields for `doctorId` and `patientId`        |
| **toString()**    | Used to print formatted object data                |

---

## 🚀 How It Works

- Maximum 10 doctors, patients, and appointments (set using `MAX` constant)
- Menu-driven program runs in a loop until you choose to exit
- Uses **fixed-size arrays** instead of `ArrayList` to keep it simple

---

## 💻 Requirements

- Java 8 or above
- Any Java IDE (IntelliJ, Eclipse, BlueJ) or simple text editor + terminal

---
