#define releUm 4
#define releDois 5
#define releTres 6
#define releQuadrado 6
#define releSom 3

int delayfinal = 100;
int duracaoPalma = 200;
int intervaloPalmas = 500;
  
int quantidadePalmas = 0;
long  momentoPalma = 0;
long esperaPalmas = 0;

void setup() {
  
  pinMode(sensorSom, INPUT);
  pinMode(releUm, OUTPUT);
  pinMode(releDois, OUTPUT);
  pinMode(releTres, OUTPUT);
  pinMode(releQuatro, OUTPUT);

  digitalWrite(releUm, HIGH);
  digitalWrite(releDois, HIGH);
  digitalWrite(releTres, HIGH);
  digitalWrite(releQuatro, HIGH);

}

void loop() {

  int leituraSom = digitalRead(sensorSom);

  if(leituraSom = LOW){

    if(momentoPalma == 0){
      momentoPalma = esperaPalmas = millis();
      quantidadePalmas = quantidadePalmas + 1;
    } else if ((millis() - momentoPalma) >= duracaoPalma){
      momentoPalma = 0;
    }

  }

  if (((millis() - esperaPalmas) > intervaloPalmas) && (quantidadePalmas != 0)){
    if(quantidadePalmas == 1){
      digitalWrite(releUm, !digitalRead(releUm));
    }

    delay(delayfinal);
    quantidadePalmas = 0;
  }
  
}
