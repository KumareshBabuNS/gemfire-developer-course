start locator --name=locator --properties-file=gemfire.properties --initial-heap=50m --max-heap=50m

start server --name=server1 --server-port=0 --classpath=../../build/classes/main --properties-file=gemfire.properties --initial-heap=50m --max-heap=50m
