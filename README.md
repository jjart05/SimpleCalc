This project is a basic calculator made using Java with a graphical user interface (GUI). My main goal was to
practice and apply the key ideas of object-oriented programming (OOP) in a simple and clear way.
The calculator can do basic math operations like add, subtract, multiply, and divide.

I used the idea of classes and objects to build the program. For example, I treated the buttons, input boxes,
and result area as separate parts (or objects). These objects work together inside the main class to make the
calculator function. This makes my code more organized and easier to manage.

To help visualize the structure of the program, I used a class diagram. In the more advanced version, I created
an abstract class called Operation, and specific classes like Add, Subtract, Multiply, and Divide that
follow its structure. This helps show how the pieces are connected and makes it easier to add more features later.


I made sure to show the four main OOP ideas:

Abstraction: I used the Operation class to represent a general math task.

Encapsulation: I kept related data and code together in one place to make things tidy.

Inheritance: The operation types all followed the same format from the Operation class.

Polymorphism: I used one method that could work with different operation types.


I also added basic error handling. For example, if the user enters letters instead of numbers or tries to divide
by zero, the program shows an error message instead of crashing. This makes the program more user-friendly
and reliable.

While I didn’t include file handling yet, I plan to add a feature that saves the user’s previous calculations to a
file. This would make the calculator more useful and show how to work with files in Java.

The GUI is made with Java Swing. It’s simple, with input fields, buttons, and a result area. It’s easy to use and
looks clean, which makes the program more enjoyable for the user.

Overall, this project helped me understand how to apply OOP in a real-world example. It started simple, but it
showed how even a small project can teach important programming skills. I’m proud of how it turned out and
excited about how I can improve it more in the future.
