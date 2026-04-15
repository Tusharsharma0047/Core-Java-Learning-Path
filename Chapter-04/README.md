# Chapter 4: Conditionals
## ⚖️ Decision Making in Java

### 1. If-Else Statement
Used to execute a block of code if a condition is true, and another block if it is false.

```java
if (condition) {
    // Executes if condition is true
} else {
    // Executes if condition is false
}
### 2. **The Else-If Ladder**
When you have more than two possibilities, use the `else-if` ladder. Java will check each condition from top to bottom and execute **only the first one** that is true.

**Syntax:**
```java
if (condition1) {
    // Code for condition 1
} 
else if (condition2) {
    // Code for condition 2
} 
else if (condition3) {
    // Code for condition 3
} 
else {
    // Code if NONE of the above are true
}

### 🔍 Relational Operators
These are used to evaluate the conditions inside `if` and `else if`:
* `==` : Check if equal
* `!=` : Check if NOT equal
* `>`  : Greater than
* `<`  : Less than
* `>=` : Greater than or equal to
* `<=` : Less than or equal to



## 💡 Pro-Tip: The "Single Line" Rule
If your `if` or `else` block has only **one line** of code, the curly braces `{ }` are optional. However, it is **best practice** to always use them to avoid bugs!

**Example:**
```java
if (isRaining) 
    System.out.println("Take an umbrella"); // Works, but braces are safer!
    re write to write or make my redime more valuable and looks very good
