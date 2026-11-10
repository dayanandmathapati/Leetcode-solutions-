
class Solution {
public:
    int lenLongestFibSubseq(vector<int>& arr) {

        unordered_set<int> s(arr.begin(), arr.end());

        int maximum = 0;

        for (int i = 0; i < arr.size(); i++) {

            for (int j = i + 1; j < arr.size(); j++) {

                int a = arr[i];
                int b = arr[j];
                int count = 2;

                while (s.find(a + b) != s.end()) {

                    int c = a + b;

                    a = b;
                    b = c;

                    count++;
                }

                maximum = max(maximum, count);
            }
        }

        return maximum >= 3 ? maximum : 0;
    }
};
