#include <bits/stdc++.h>
using namespace std;


#define int ll
#define ff first
#define ss second
#define pb push_back
#define all(a) (a).begin(), (a).end()
#define sz(x) long(x.size())
#define rs resize
#define qmn(a, b) a = min(a, b)
#define qmx(a, b) a = max(a, b)
#define fastio() cin.tie(nullptr)->sync_with_stdio(false)
typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
const int MOD = 998244353;
const int INF32 = 2e9 + 5;
const ll INF64 = 2e18 + 5;
const int MX = 2e5 + 5;
const ld EPS = 1e-12;
const ld PI = atan2(0, -1);

template<typename T>
istream &operator >> (istream &in, pair<T, T> &p) {
    return in >> p.ff >> p.ss;
}

template<typename T>
ostream &operator << (ostream &out, pair<T, T> &p) {
    return out << "(" << p.ff << " " << p.ss << ")";
}

template<typename T>
istream &operator >> (istream &in, vector<T> &v) {
    for (int &el : v) {
        in >> el;
    }
    return in;
}

template<typename T>
ostream &operator << (ostream &out, vector<T> &v) {
    for (T &el : v) {
        out << el << " ";
    }
    return out;
}


void solve() {
    //solve here
    cout << "testing of pulling\n";
}


int32_t main() {
    fastio();
    int tests = 1;
//    cin >> tests;
    while (tests--) solve();
    return 0;
}
