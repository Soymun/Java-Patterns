package behavior.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class JavaDeveloper implements Iterable<JavaDeveloper>{
    JavaDeveloper[] javaDevelopers = new JavaDeveloper[50];
    @Override
    public void forEach(Consumer<? super JavaDeveloper> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<JavaDeveloper> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator<JavaDeveloper> iterator() {
        return new Iterators();
    }
    private class Iterators implements Iterator<JavaDeveloper>{
        int id = 0;
        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super JavaDeveloper> action) {
            Iterator.super.forEachRemaining(action);
        }

        @Override
        public boolean hasNext() {
            return id < javaDevelopers.length;
        }

        @Override
        public JavaDeveloper next() {
            return javaDevelopers[id++];
        }
    }
}
