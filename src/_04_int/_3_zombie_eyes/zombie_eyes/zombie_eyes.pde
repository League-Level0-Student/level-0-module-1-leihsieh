
void setup() {
  PImage face = loadImage("face.jpeg");
  size(400,400);
  face.resize(400,400);
  image(face,0,0);
}
void draw() {
  fill(mouseX,mouseY,0);
  circle(155,180,80);
  circle(240,180,80);
  fill(0,0,0);
  circle(155,180,30);
  circle(240,180,30);
}
