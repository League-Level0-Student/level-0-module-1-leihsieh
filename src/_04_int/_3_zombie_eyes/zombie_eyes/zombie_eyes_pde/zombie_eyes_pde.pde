void setup(){
  PImage face = loadImage("face.png");
  size(600,500);
  face.resize(600,500);
  image(face,0,0);
}

void draw() {
  circle(275,230,40);
  circle(320,230,40);
}
