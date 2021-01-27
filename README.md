# EDU-AQA-Calculator
Self-written calculator and tests for it
![img](https://user-images.githubusercontent.com/66497536/106016862-f2543100-60d0-11eb-879c-797423488599.png)

**Task:**

Create a Calculator.java class containing 4 methods: sum, difference, division, multiplication
Use TestNG annotations and parameters, @BeforeMethod, @AfterMethod, dataProvider, run in parallel (via .xml file), RetryAnalyzer, TestListener, description, priority, invocationCount, threadPoolSize

My calculator has different modes:

![image](https://user-images.githubusercontent.com/66497536/104688913-b0131300-5712-11eb-9a4b-0ab4663cb8dd.png)

Used for creating setting-classes:

![image](https://user-images.githubusercontent.com/66497536/104689236-39c2e080-5713-11eb-87b1-1abc0d9fe737.png)

Wich contains lambda-methods of operations:

![image](https://user-images.githubusercontent.com/66497536/104689110-01230700-5713-11eb-99f7-194feac15e77.png)

The calculator is created using the factory-class:

![image](https://user-images.githubusercontent.com/66497536/104688995-d3d65900-5712-11eb-82ee-f7a25a7a799a.png)

Also, the calculator has two states: activated and deactivated, which is changed by appropriate methods. It means that calculator will throw an Exception every time when you try to do any operation when it is deactivated (Calculator.java):

![image](https://user-images.githubusercontent.com/66497536/104689548-bfdf2700-5713-11eb-8e6f-635b34c394c9.png)

How it works in console (Run.java):

![image](https://user-images.githubusercontent.com/66497536/104689866-64616900-5714-11eb-901b-8d8d6fbc7fbc.png)
