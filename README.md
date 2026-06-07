# CalcKit 🧮

CalcKit is a Java-based CLI multi-tool calculator built to handle everyday math and conversions. From basic arithmetic to grade calculation, unit conversion, and number analysis — everything you need in one clean, menu-driven console app.

---

## What it does

| # | Feature | Description |
|---|---------|-------------|
| 1 | 🌡️ Temperature Converter | Convert between Celsius and Fahrenheit |
| 2 | ➕ Normal Calculator | Add, subtract, multiply, divide, and power |
| 3 | 📊 Grade Calculator | Input grades and get your average, letter grade, and pass/fail status |
| 4 | 🔢 Odd/Even Checker | Check if a number is odd or even |
| 5 | 📐 Factorial Calculator | Calculate the factorial of any non-negative number |
| 6 | 📏 Unit Converter | Convert distance, weight, and volume units |

---

## Getting Started

### Requirements
- Java 13 or higher (for text blocks)
- A terminal / command prompt
---

## Installation (Windows)
 
### Step 1 — Install Java
1. Go to [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
2. Download the **Windows x64 Installer** (`.exe`)
3. Run the installer and follow the steps
### Step 2 — Verify Java is installed
Open **Command Prompt** and type:
```bash
java -version
```
You should see something like:
```
java version "21.0.1" ...
```
If you get an error, Java isn't in your PATH — restart your PC and try again.
 
### Step 3 — Download CalcKit
Download or clone this repo:
```bash
git clone https://github.com/yourusername/CalcKit.git
```
Or just download the ZIP and extract it.
 
### Step 4 — Run it
Open Command Prompt inside the project folder and run:
```bash
javac Main.java
java Main
```
 
> 💡 **Tip:** To open CMD in a folder, hold `Shift` and right-click the folder → "Open PowerShell window here"
 
---
### Run it
```bash
javac Main.java
java Main
```

---

## How to use

When you launch CalcKit, you'll see a menu like this:

```
================================
        Welcome to CalcKit!
================================
1- Temperature Converter
2- Normal Calculator
3- Grade Calculator
4- Odd/Even Checker
5- Factorial Calculator
6- Unit Converter
0- Exit
================================
Choose an option:
```

Just enter the number of the tool you want and follow the prompts. Each tool walks you through step by step.

---

## Features in detail

### 🌡️ Temperature Converter
Converts between Celsius and Fahrenheit in both directions.
```
--- Temperature Converter ---
1- Fahrenheit (from Celsius)
2- Celsius (from Fahrenheit)

Enter temperature (°C): 100
100.00°C = 212.00°F
```

### ➕ Normal Calculator
Supports `+`, `-`, `*`, `/`, and `^` (power).
```
Enter first number: 2
Enter second number: 8
Enter operator: ^
2.0 ^ 8.0 = 256.0
```

### 📊 Grade Calculator
Enter as many grades as you want, and get a full report.
```
-------- Grade Report --------
  Grades Entered : 5
  Total Score    : 430.00
  Average        : 86.00
  Letter Grade   : B
  Status         : Pass ✅
------------------------------
```

### 📏 Unit Converter
Handles three categories:
- **Distance** — km ↔ miles
- **Weight** — kg ↔ lbs
- **Volume** — liters ↔ gallons

---

## Built with

- Java (core language)
- `Scanner` for user input
- `Math` and `BigInteger` libraries
- No external dependencies

