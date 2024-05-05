const int angSenPin = A0; // KY-037 sensor's analog output connected to A0
const int digSenPin = 2; // KY-037 sensor's digital output connected to pin 2
const int ledPin = 4; // LED connected to digital pin 4
boolean LEDStatus=false;
int angSenValue = 0; // Variable to store the sensor reading
int digSenValue = 0; // Variable to store the sensor reading
int threshold = 300; // Adjust this threshold based on your environment
void setup() {0
pinMode(digSenPin,INPUT);
pinMode(ledPin,OUTPUT); // Set the LED pin as an output
Serial.begin(9600); // Initialize serial communication for debugging
}
void loop() {
 angSenValue = analogRead(angSenPin); // Read the analog sensor value
 digSenValue = digitalRead(digSenPin); // Read the digital sensor value
 Serial.println(angSenValue); // Debugging: Print the sensor value to the serial
monitor
Serial.println(digSenValue); // Debugging: Print the sensor value to the serial
monitor
 if(digSenValue==1){ 
 if(LEDStatus==false){
 LEDStatus=true;
 digitalWrite(ledPin,HIGH);
 }
 else {
 LEDStatus=false;
 digitalWrite(ledPin,LOW);
 }
 delay(500);
 }
}
