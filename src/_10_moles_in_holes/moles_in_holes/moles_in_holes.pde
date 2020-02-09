void draw() {
  fill(#B29C63);
ellipse(72,95,60,60);
fill(#000000);
ellipse(60,93,10,10);
ellipse(83,93,10,10);
fill(#F5E3B4);
ellipse(72,110,25,25);
fill(#000000);
ellipse(72,100,10,10);
ellipse(72,110,18,4);
//there is only one mole because of the sake of time...

/* Use the method below to put moles in the holes. */


}

void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30); // holes!
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
}
