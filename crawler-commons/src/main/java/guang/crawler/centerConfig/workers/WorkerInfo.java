package guang.crawler.centerConfig.workers;

import guang.crawler.centerConfig.CenterConfigElement;
import guang.crawler.connector.CenterConfigConnector;
import guang.crawler.util.PathHelper;

public class WorkerInfo extends CenterConfigElement {

	private final String workerID;

	public WorkerInfo(String path, CenterConfigConnector connector) {
		super(path, connector);
		this.workerID = PathHelper.getName(path);
		// TODO Auto-generated constructor stub
	}

	public String getWorkerID() {
		return this.workerID;
	}

}
