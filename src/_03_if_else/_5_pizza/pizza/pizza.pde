void setup() {
  size(400,400); 
  noStroke();
  fill(#E3DF67);
  circle(200,200,200);
  fill(225,0,0);
  circle(200,200,180);
  fill(#FFF81C);
  circle(200,200,160);
}
void draw() {
  PImage pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(50,50);
  
  if(mousePressed){
  image(pepperoni,mouseX,mouseY);
  }
}
