

/*
Array is a collection of same elemment which are placed in a contiguous memory location.
the indexing of arrray starts from 0

1. Definition
Array: A fixed-size sequential collection of elements of the same type.
Vector: A dynamic array that can grow or shrink in size during runtime.

2. Memory Allocation
Array: Allocates contiguous memory and requires the size to be declared at the time of creation.
Vector: Automatically resizes itself as elements are added or removed. Uses dynamic memory allocation.

3. Size & Flexibility
Array:
Fixed size; cannot be changed after declaration.
If fewer elements are stored, the remaining space is wasted.
Vector:
Resizable at runtime as needed.
Can store more elements without waste by dynamically adjusting the underlying storage.

4. Performance
Array:
Faster, as it doesn’t involve dynamic resizing.
Suitable for applications where size is known beforehand.
Vector:
May be slightly slower due to resizing overhead.
Provides more flexibility when the size is uncertain.

5. Operations
Array:
Does not offer built-in methods for inserting or deleting elements.
Adding/removing elements requires manual operations, which can be complex.
Vector:
Offers methods like push_back(), pop_back(), etc., to add or remove elements easily.

<------------------------------------------------------------------------------------------------------>

When to Use
Array: When the size is fixed and performance is critical.
Vector: When the size is unknown or when frequent additions/removals are expected.


*/