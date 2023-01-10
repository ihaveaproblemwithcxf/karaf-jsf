Run:
./build-and-run.sh

Run without cxf:
./build-and-run.sh without-cxf


Endpoints:
 * JSF-Application: http://localhost:8181
 * Whiteboard Servlet: http://localhost:8181/extra
 * CXF: http://localhost:8181/cxf
 * Demo Webservice: http://localhost:8181/cxf/demo


Issues to resolve:
 * JSF not starting properly
 * Bean resoultion in index.xhtml not working (when running without cxf)
 * Demo Webservice not called when requesting http://localhost:8181/cxf/demo
