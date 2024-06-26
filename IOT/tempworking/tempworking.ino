#include <DHT.h>
#define DHTPIN 2 // Use the pin number you connected the DATA line to
#define DHTTYPE DHT11 // DHT11 or DHT22, depending on your sensor
DHT dht(DHTPIN, DHTTYPE);
void setup() {
  // put your setup code here, to run once:
 Serial.begin(9600);
 dht.begin();

}

void loop() {
  // put your main code here, to run repeatedly:
 delay(2000); // Wait for 2 seconds between measurements
 float tempC = dht.readTemperature(); // Read temperature in Celsius
 float tempF = dht.readTemperature(true); // Read temperature in Farehneight
 float humidity = dht.readHumidity(); // Read humidity
 if (isnan(tempC) || isnan(tempF) || isnan(humidity)) {
 Serial.println("Failed to read from DHT sensor!");
 return;
 }
 Serial.print("Temperature Celcius: ");
 Serial.print(tempC);
 Serial.print(" Temperature Farenneight: ");
 Serial.print(tempF);
 
 Serial.print(" °C | Humidity: ");
 Serial.print(humidity);
 Serial.println(" %");

}
