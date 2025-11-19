We iterate over nums and in a hashmap we store
key = difference between target and current number
value = the current index

thanks to that later we can check if map already contains an entry with a key which is a target - currentDifference, if yes them out current number and the number at index which is stored as value is a pair of indexes to be returned
