def make_change(target, coins)
  return 0 if coins == []
  prev_case = make_change(target, coins[1..-1])
  min_length = prev_case
  result = []
  dup = target

  coins.each do |coin|
    until dup < coin
      result.push(coin)
      dup -= coin
    end
  end

  min_length = result.length

  if prev_case == 0
    return result.length
  end

  if prev_case < result.length
    min_length = prev_case
  end
  puts min_length
  return min_length
end

puts make_change(64, [25, 10, 7, 1])
