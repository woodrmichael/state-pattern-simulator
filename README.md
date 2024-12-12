# State Pattern Simulator

This repository contains a Java implementation of a **State Pattern Simulator**, which models the behavior of a car's transmission system. The simulation demonstrates the use of the **State Design Pattern** to manage state transitions and behavior dynamically at runtime.

## Features

- Models a car with various transmission states (Park, Reverse, Neutral, Low, High).
- Simulates realistic gear transitions and behaviors based on user input.
- Implements a graphical interface using JavaFX for interaction and visualization.
- Handles user inputs (keyboard and mouse) to control the car's speed and gear shifts.

## Core Components

### 1. State Pattern
The `Gear` interface and its implementations (`GearPark`, `GearReverse`, `GearNeutral`, `GearLow`, and `GearHigh`) represent the states of the car. Each gear defines its behavior (`resolveBehavior`) and transitions (`nextGear`) based on user input.

### 2. Car
The `Car` class encapsulates the state of the car, including:
- Current gear.
- Speed.
- Whether the car is stalled.
- Updates its behavior and transitions gears based on user input.

### 3. User Input Management
The `UserInput` class manages keyboard and mouse interactions:
- Detects key presses and releases.
- Tracks mouse movements and clicks.
- Maps user inputs to corresponding car actions, such as accelerating, decelerating, and shifting gears.

## How It Works

1. The car starts in **Park** gear with zero speed and is stalled.
2. Users can:
    - **Shift gears** using specific key bindings.
    - **Accelerate or decelerate** using a key (e.g., "SPACE").
    - **View real-time state changes** such as speed, gear, and stall status.
3. Each gear defines its unique behavior and transition rules:
    - **Park**: The car stops and slowly reduces speed to zero.
    - **Reverse**: The car moves backward up to a set speed limit.
    - **Neutral**: The car coasts, slowly losing speed.
    - **Low**: The car accelerates with a lower maximum speed.
    - **High**: The car accelerates with a higher maximum speed.

---

### Authors
- Michael Wood
- Alex Wunderlin
- Cocoro Wachi
- Vincent Martin