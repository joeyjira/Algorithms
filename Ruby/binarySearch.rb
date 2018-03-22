def binary_search(array, left, right, target)
  middle = left + right >> 1

  if right >= left
    if target == array[middle]
      return middle
    elsif target < array[middle]
      return binary_search(array, left, middle - 1, target)
    elsif target > array[middle]
      return binary_search(array, middle + 1, right, target)
    end
  end

  return -1
end

test_array = [-2, 0, 3, 4, 7, 9]
puts binary_search(test_array, 0, test_array.length, -1)
