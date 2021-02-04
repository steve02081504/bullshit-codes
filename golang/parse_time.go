package main

import "fmt"
import "time"

func main(){
	tm := parseTime("2021-02-04")
	fmt.Println(tm)
}

func parseTime(timeStr string) time.Time {
	tm, _ := time.Parse(timeStr, "2006-01-02")
	return tm
}
