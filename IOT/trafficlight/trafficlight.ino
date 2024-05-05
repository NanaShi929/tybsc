void setup() {
  // put your setup code here, to run once:
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
}

void loop() {
  digitalWrite(8, HIGH);
  delay(6000);
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  delay(15000);
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  delay(2000);
  digitalWrite(10, LOW);
  // put your main code here, to run repeatedly:
}
