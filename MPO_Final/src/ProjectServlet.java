

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Project;

/**
 * Servlet implementation class ProjectServlet
 */
@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projectTitle = request.getParameter("projectTitle");
		String projectId= request.getParameter("projectId");
		String projectDescription= request.getParameter("projectDescription");
		String projectPhases= request.getParameter("projectPhases");
		String projectType= request.getParameter("projectType");
		String termini= request.getParameter("termini");
		String network= request.getParameter("network");
		String totalProjectCost = request.getParameter("totalProjectCost");
		String sponsor= request.getParameter("sponsor");
		String yoe = request.getParameter("yoe");
		String airQualityAnalysisCO = request.getParameter("airQualityAnalysisCO");
		String airQualityAnalysisNOX = request.getParameter("airQualityAnalysisNOX");
		String airQualityAnalysisVOC = request.getParameter("airQualityAnalysisVOC");
		String area = request.getParameter("area");
		String capacityProject = request.getParameter("capacityProject");
		String city = request.getParameter("city");
		String county = request.getParameter("county");
		String dotDistrict = request.getParameter("dotDistrict");
		String federalFiscalyear = request.getParameter("federalFiscalyear");
		String federalFunctionalClassification = request.getParameter("federalFunctionalClassification");
		String fundProjectType = request.getParameter("fundProjectType");
		String highwayRoadwayName = request.getParameter("highwayRoadwayName");
		String limitFrom = request.getParameter("limitFrom");
		String limitTo = request.getParameter("limitTo");
		long networkYear = Integer.valueOf(request.getParameter("networkYear"));
		long numberMiles = Integer.valueOf(request.getParameter("numberMiles"));	
		long numberExistingLanes = Integer.valueOf(request.getParameter("numberExistingLanes"));	
		long numberProjectedLanes = Integer.valueOf(request.getParameter("numberProjectedLanes"));
		String remarks = request.getParameter("remarks");
		String scopeOfProduct = request.getParameter("scopeOfProduct");
		String stateSystemRoad = request.getParameter("stateSystemRoad");
		String transitInformation = request.getParameter("transitInformation");
		boolean isApproved = Boolean.valueOf(request.getParameter("isApproved"));
		

		Project project = new Project( projectTitle, projectId,  projectDescription, projectPhases,  projectType, termini,
				 network,  totalProjectCost,  sponsor,  yoe, airQualityAnalysisCO, airQualityAnalysisNOX, airQualityAnalysisVOC,
				 area,  capacityProject,  city,  county,  dotDistrict,  federalFiscalyear,  federalFunctionalClassification,
				 fundProjectType, highwayRoadwayName,  limitFrom,  limitTo,  networkYear,  numberMiles,  numberExistingLanes,
				 numberProjectedLanes, remarks,   scopeOfProduct,  stateSystemRoad,  transitInformation);
	}

}
