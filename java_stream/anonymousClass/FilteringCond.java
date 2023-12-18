package java_stream.anonymousClass;

@FunctionalInterface
public interface FilteringCond {
    abstract boolean test(Hotel hotel);
}
