# Fullstack-IoT

## Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)

## Overview

Project showcasing a setup to show temperature data in real-time including data collection, backend, database and frontend.

### Hardware

- Arduino with temperature sensor(DHT11)

### Software

- Python
- Npm - React
- Spring framework
- PostgreSQL

### Arduino Setup

1. Connect the temperature sensor to your Arduino.
2. Upload the Arduino sketch.

### Backend Setup (Spring and PostgreSQL)

1. Clone the backend repository.
2. Configure the PostgreSQL database.
3. Run the Spring application.

### Frontend Setup (React)

1. Clone the frontend repository.
2. Install dependencies using npm or yarn.
3. Configure the frontend to connect to the WebSocket server.
4. Run the React application.

## Configuration

Change IP addresses in both frontend and backend. Double check ports.

### Backend Configuration

- Update the database connection settings in `application.properties`.
- Set the server IP address and port for the WebSocket connection.

### Frontend Configuration

- Update the WebSocket URL in the frontend code to match your server's address (TempChart).

## Usage

Provide instructions on how to use your project.

1. Connect the Arduino to your computer.
2. Run the Python script to collect and send temperature data.
3. The data will be inserted into the PostgreSQL database and pushed to the frontend.
4. Open the React frontend to view the real-time temperature data.
