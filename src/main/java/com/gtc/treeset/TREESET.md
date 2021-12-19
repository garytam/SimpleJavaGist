# TreeSet

## object must implement 
    Comparable

    public int compareTo(Movie e){ //implementing abstract method.
        return (name + releaseYear).compareTo(e.name + e.releaseYear);
    }
