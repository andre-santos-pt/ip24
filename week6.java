class week6 {
  
}

record Dimension(int width, int height) {
    Dimension {
        assert width > 0;
        assert height > 0;
    }

    int area() {
        return width * height;
    }
    
    int perimeter() {
        return width * 2 + height * 2;
    }
    
    boolean isSquare() {
        return width == height;
    }
    
    boolean isVertical() {
        return height > width;
    }
    
    boolean isHorizontal() {
        return !isVertical();
    }
    
    boolean largerThan(Dimension d) {
        return area() > d.area();
    }
    
    Dimension scale(int factor) {
        assert factor > 0;
        return new Dimension(this.width * factor, this.height * factor);
    }
}

record Position(int line, int column) {
    Position right() {
        return new Position(line, column + 1);
    }
    
    Position left() {
        return new Position(line, column - 1);
    }
    
    Position top() {
        return new Position(line - 1, column);
    }
    
    Position bottom() {
        return new Position(line + 1, column);
    }
    
    Position[] adjacent() {
        return new Position[] {
            top(), right(), bottom(), left()
        };
    }
    
    Position[] adjacentNonNegative() {
        int len = 2;
        if(line > 0)
            len++;
        if(column > 0)
            len++;
            
        Position[] array = new Position[len];
        int i = 0;
        if(line > 0) {
            array[i] = top();
            i++;    
        }
        array[i] = right();
        i++;
        array[i] = bottom();
        i++;
        if(column > 0)
            array[i] = left();
        return array;
    }
}