int x=150;
int x1=850;
int speed=1;
void setup() {
   size(1000,500);
}

void draw() {
  background(#A5FFF4);
  // Go to the recipe to run the demonstration before starting this program
  int size = 300;
  for(int i=0; i<10; i++){
    
   noFill();
    
    ellipse(x,250,size,size);
    size-=30;
  }
  
    size = 300;
  for(int i=0; i<10; i++){
    
   noFill();
    
    ellipse(x1,250,size,size);
    size-=30;
  }
  x+=speed;
  x1-=speed;
  if(x>=850 ||x<=150  ){
    speed*=-1;
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */}
