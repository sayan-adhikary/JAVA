function longestCommonSubstring(str1, str2) {
  let maxSubstring = "";

  for (let i = 0; i < str1.length; i++) {
    let current = "";

    for (let j = i; j < str1.length; j++) {
      current += str1[j];

      if (str2.includes(current)) {
        if (current.length > maxSubstring.length) {
          maxSubstring = current;
        }
      }
    }
  }

  return maxSubstring === "" ? "No Common Substring" : maxSubstring;
}

console.log(longestCommonSubstring("ABABC", "BABCA"));