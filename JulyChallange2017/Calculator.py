m=int(input())
for i in range(m):
	n,b = map(int,input().split())
	t = ((n/(2*b)))
	m = int(t)
	f = int(t) + 1
	sol = ((n-(m*b))*(m))
	ksol = ((n-(f*b))*(f))
	if(sol>ksol):
		print(sol)
	else:
		print(ksol)