import paramiko
import serial
import requests

backend_address = 'http://localhost:8080/insert'

try:
    # Change COM if necessary.
    ser = serial.Serial('COM3', 9600)

    try:
        while True:
            # Reading data from serial
            line = ser.readline().decode('utf-8').strip()
            
            try:
                temperature = float(line)
                location = 'Location of sensor'
                payload = {
                    "temp": temperature,
                    "plats": location
                }
                response = requests.post(backend_address, json=payload)

                if response.status_code == 200:
                    print(f"Saving temp: {temperature} at: {location} in DB temperature.")
                
            except ValueError:
                print(f"Wrong data: {line}")

    except KeyboardInterrupt:
        print("\nClosing...")

except paramiko.AuthenticationException:
    print("Connection failed...")
finally:
    ser.close()