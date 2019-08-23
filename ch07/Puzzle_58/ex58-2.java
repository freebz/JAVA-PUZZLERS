public boolean equals(Object o) {
    if (!(o instanceof Name))
	return false;
    Name n = (Name)o;
    return n.first.equals(first) && n.last.equals(last);
}
