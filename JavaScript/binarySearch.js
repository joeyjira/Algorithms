function binarySearch(array, left, right, target)
{
  let middle = left + right >>> 1;

  if (right >= left)
  {
    if (target === array[middle])
    {
      return middle;
    }
    else if (target < array[middle])
    {
      return binarySearch(array, left, middle - 1, target);
    }
    else if (target > array[middle])
    {
      return binarySearch(array, middle + 1, right, target)
    }
  }

  return null;
}

let testArray = [-10, -5, -2, 0, 1, 3, 5, 7];
console.log(binarySearch(testArray, 0, testArray.length, 2));
