#define del 1000 // Next number will be displayed after 1 second 
#define A 12 // connect pin number 12 to A input of LED Display 
#define B 11 
#define C 10 
#define D 9 
#define E 8 
#define F 7 
#define G 6 
#define DP 5 // connect pin number 5 to DP input of LED display 
void setup() {
  // put your setup code here, to run once:
  pinMode(A, OUTPUT); 
  pinMode(B, OUTPUT); 
  pinMode(C, OUTPUT); 
  pinMode(D, OUTPUT); 
  pinMode(E, OUTPUT); 
  pinMode(F, OUTPUT); 
  pinMode(G, OUTPUT); 
  pinMode(DP, OUTPUT);

}
void zero() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, LOW); 
  digitalWrite(E, LOW); 
  digitalWrite(F, LOW); 
  digitalWrite(G, HIGH); 
  delay(del); 
} 
 
void one() { 
  digitalWrite(A, HIGH); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, HIGH); 
  digitalWrite(E, HIGH); 
  digitalWrite(F, HIGH); 
  digitalWrite(G, HIGH); 
  delay(del); 
} 
 
void two() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, LOW); 
  digitalWrite(C, HIGH); 
  digitalWrite(D, LOW); 
  digitalWrite(E, LOW); 
  digitalWrite(F, HIGH); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
void three() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, LOW); 
  digitalWrite(E, HIGH); 
  digitalWrite(F, HIGH); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
void four() { 
  digitalWrite(A, HIGH); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, HIGH); 
  digitalWrite(E, HIGH); 
  digitalWrite(F, LOW); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
void five() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, HIGH); 
  digitalWrite(C, LOW); 
  digitalWrite(D, LOW); 
  digitalWrite(E, HIGH); 
  digitalWrite(F, LOW); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
void six() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, HIGH); 
  digitalWrite(C, LOW); 
  digitalWrite(D, LOW); 
  digitalWrite(E, LOW); 
  digitalWrite(F, LOW); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
void seven() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, HIGH); 
  digitalWrite(E, HIGH); 
  digitalWrite(F, HIGH); 
  digitalWrite(G, HIGH); 
  delay(del); 
} 
 
void eight() { 
  digitalWrite(A, LOW); 
  digitalWrite(B, LOW); 
  digitalWrite(C, LOW); 
  digitalWrite(D, LOW); 
  digitalWrite(E, LOW); 
  digitalWrite(F, LOW); 
  digitalWrite(G, LOW); 
  delay(del); 
} 
 
  
void nine() { 
digitalWrite(A, LOW); 
digitalWrite(B, LOW); 
digitalWrite(C, LOW); 
digitalWrite(D, LOW); 
digitalWrite(E, HIGH); 
digitalWrite(F, LOW); 
digitalWrite(G, LOW);
delay(del);

}
void loop() {
  // put your main code here, to run repeatedly:
    zero() ; 
  one(); 
  two() ; 
  three(); 
  four(); 
  five(); 
  six(); 
  seven(); 
  eight(); 
  nine(); 

}

