we fill the output array with 1 ones only

then we iterate from left and setting every value to the product of all the elements before - by that we get the product of elements before in every cell

then we do the very same thing but from the right, in the end we have the product of all the other elements in every cell

time complexity is O(n) since we iterate over the array twice O(2n) -> O(n)
