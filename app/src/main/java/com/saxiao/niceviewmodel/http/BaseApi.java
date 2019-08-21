package com.saxiao.niceviewmodel.http;

/**
 * 接口地址类
 */

public class BaseApi {
	/**
	 * public static String BaseUrl = "http://www.tv188.com/";
	 *
	 */
	/**
	 * 潘燕
	 */
	//public static String BaseUrl = "http://192.168.1.29:8080/psms/api/";
	//public static String BaseImgUrl = "http://192.168.1.29:8080/psms/upload";
	/**
	 * 张帅
	 */
     //public static String BaseUrl = "http://192.168.1.116:8088/psms/api/";
     //public static String BaseImgUrl = "http://192.168.1.116:8088/psms/upload";
	/**
	 * 胡宗章
	 */
    //public static String BaseUrl = "http://192.168.1.60:8080/psms/api/";
	//public static String BaseImgUrl = "http://192.168.1.60:8080/psms/upload";
	/**
	 * 李诏
	 */
	//public static String BaseUrlZ = "http://192.168.1.34:8180/psms";
	//public static String BaseImgUrlZ = "http://192.168.1.34:8180/psms";

	/**
	 * 毕伟龙
	 */
	//public static String BaseUrl = "http://192.168.1.175:8080/psms/api/";
	//public static String BaseImgUrl = "http://192.168.1.175:8080/psms/upload";

    public static String token="";

	public static String BaseUrl = "";

	public static String BaseImgUrl ="";
	/**
	 * 登录
	 */
	public static final String Login = "apiLogin";

	/**
	 * 通用
	 */
	public static final String Common = "apiCommon";

	/**
	 * 库存管理
	 */
	public static final String Stock = "apiStock";

	/**
	 * 会检提料管理
	 */
	public static final String MeetingInspection = "apiMeetinginspection";

	/**
	 * 检修提料管理
	 */
	public static final String OverhaulInspection = "apiOverhaulInspection";

	/**
	 * 循环检修工单
	 */
	public static final String LoopInspectionWorkOrder = "apiRecyclingOrder";

	/**
	 * 循环检修任务
	 */
	public static final String LoopInspectionTask = "apiRecyclingTask";

	/**
	 * 配料任务管理
	 */
	public static final String BatchingTask = "apiBatchingTask";

	/**
	 * 配送任务管理
	 */
	public static final String DeliveryTask = "apiDeliveryTask";

	/**
	 * 配料单
	 */
	public static final String Batching = "apiBatching";

	/**
	 * 缺料单
	 */
	public static final String Shortage = "apiShortage";

	/**
	 * 配送单
	 */
	public static final String Delivery = "apiDelivery";

	/**
	 * 扫码签收
	 */
	public static final String ScanSign = "apiScanSignManager";


	/**
	 * Retrofit_banner
	 */
    public static final String Retrofit_Banner = "mobile/listSlides.do";

	/**
	 * 登录
	 */
    public static final String doLogin = Login+"/login.action";

	/**
	 * 修改密码
	 */
	public static final String UpdatePassword = Login+"/modifyPWD.action";

	/**
	 * 版本信息
	 */
	public static final String latestVersion = Login+"/latestVersion.action";

	/**
	 * APK下载
	 */
	public static final String downLoadAPK = Login+"/downLoad4Android.action";

	/**
	 * 库存管理
	 */
	public static final String StockList = Stock+"/list.action";

	/**
	 * 仓库列表
	 */
	public static final String houseList = Stock+"/warehouseList.action";

	/**
	 * 会检领料列表
	 */
	public static final String meetinginspectionList= MeetingInspection+"/list.action";

	/**
	 * 会检上传
	 */
	public static final String meetingInspectionSub= MeetingInspection+"/add.action";

	/**
	 * 会检：删除
	 */
	public static final String meetingInspectionDelete= MeetingInspection+"/drop.action";

	/**
	 * 会检：提交
	 */
	public static final String meetingInspectionCommit= MeetingInspection+"/doSubmit.action";

	/**
	 * 会检：撤销
	 */
	public static final String meetingInspectionRock= MeetingInspection+"/doRevoke.action";

	/**
	 * 会检：撤销
	 */
	public static final String meetingInspectionConfirm= MeetingInspection+"/isConfirm.action";

	/**
	 * 会检：查看配料情况
	 */
	public static final String seeBatchingInfo = MeetingInspection+"/batchingList.action";

	/**
	 * 会检：查看配料情况详情
	 */
	public static final String seeBatchingInfoDetail = MeetingInspection+"/batchingUnitList.action";

	/**
	 * 会检：查看配送情况
	 */
	public static final String seeDeliveryInfo = MeetingInspection+"/deliveryList.action";

	/**
	 * 会检：查看配送情况详情
	 */
	public static final String seeDeliveryInfoDetail = MeetingInspection+"/deliveryUnitList.action";

	/**
	 * 会检：生成配送需求计划
	 */
	public static final String createDeliveryPlan = MeetingInspection+"/createPlan.action";


	/**
	 * 获取检修单元
	 */
	public static final String inspectionUnit= Common+"/partstypeList.action";

	/**
	 * 会检修改/详情：获取会检模具列表
	 */
	public static final  String getMaterialUnitList = MeetingInspection+"/meetingInspectionMaterialUnitList.action";

	/**
	 * 选择会检领料物料单元
	 */
	public static final  String getSelectMaterialUnitList = Common+"/materialunitList.action";

	/**
	 * 选择会检领料物资
	 */
	public static final  String getSelectMaterialList = Common+"/materialList.action";

	/**
	 * 检修列表
	 */
	public static final  String getOverHaulList = OverhaulInspection+"/list.action";

	/**
	 * 匹配会检单
	 */
	public static final  String getPphjdList = OverhaulInspection+"/trainnumList.action";

	/**
	 * 检修新增
	 */
	public static final  String overhaulAdd = OverhaulInspection+"/add.action";

	/**
	 * 检修删除
	 */
	public static final  String overhaulDelete = OverhaulInspection+"/drop.action";

	/**
	 * 检修确定
	 */
	public static final  String overhaulConfirm = OverhaulInspection+"/doConfirm.action";

	/**
	 * 检修撤销
	 */
	public static final  String overhaulRock = OverhaulInspection+"/doRevoke.action";

	/**
	 * 检修提交
	 */
	public static final  String overhaulCommit = OverhaulInspection+"/doSubmit.action";

	/**
	 * 检修详情
	 */
	public static final  String overhaulDetail = OverhaulInspection+"/overhaulInspectionMaterialUnitList.action";

	/**
	 * 检修：生成配送需求计划
	 */
	public static final  String overhaulCreatePlan = OverhaulInspection+"/createPlan.action";

	/**
	 * 检修：查看配料情况
	 */
	public static final  String seeBatchingInfoOver = OverhaulInspection+"/batchingList.action";
	/**
	 * 检修：查看配料情况详情
	 */
	public static final  String seeBatchingInfoDetatilOver = OverhaulInspection+"/batchingUnitList.action";
	/**
	 * 检修：查看配送
	 */
	public static final  String seeDeliveryInfoOver = OverhaulInspection+"/deliveryList.action";
	/**
	 * 检修：查看配送情况详情
	 */
	public static final  String seeDeliveryInfoDetailOver = OverhaulInspection+"/deliveryUnitList.action";

	/**
	 * 循环检修工单详情页
	 */
	public static final String getLoopInspectionDetailList = LoopInspectionWorkOrder+"/detailList.action";

	/**
	 * 循环检修工单列表页
	 */
	public static final String getLoopInspectionList =  LoopInspectionWorkOrder+"/list.action";

	/**
	 * 循环检修工单列表页的撤销
	 */
	public static final String rockLoopData =  LoopInspectionWorkOrder+"/doRevoke.action";

	/**
	 * 循环检修工单列表页的提交
	 */
	public static final String subLoopData = LoopInspectionWorkOrder+"/doSubmit.action";

	/**
	 * 获取审核人员
	 */
	public static final String getAuditMan = Login+"/auditmanList.action";

	/**
	 * 循环件检修工单新增页上传
	 */
	public static final  String postLoopAddData = LoopInspectionWorkOrder+"/add.action";

	/**
	 * 审核流程
	 */
	public static final  String auditFlow = Login+"/getWorkflowList.action";

	/**
	 * 循环件检修工单列表项删除
	 */
	public static final  String deleteLoopList = LoopInspectionWorkOrder+"/drop.action";

	/**
	 * 循环件检修工单新增页物资选择
	 */
	public static final  String loopMaterialSelect =  LoopInspectionWorkOrder+"/recyclingStockList.action";

	/**
	 * 循环件检修工单详情页：确定
	 */
	public static final  String loopDetailSure =  LoopInspectionWorkOrder+"/doConfirm.action";

	/**
	 * 会检人员列表
	 */
	public static final  String selectUserList="apiCommon/staffList.action";

	/**
	 * 循环检修任务列表页
	 */
	public static final String getLoopInspectionTaskList = LoopInspectionTask+"/list.action";

	/**
	 * 循环检修任务详情页
	 */
	public static final String getLoopInspectionTaskDetailList =  LoopInspectionTask+"/detailList.action";

	/**
	 * 循环检修任务详情页入库
	 */
	public static final String loopInstore = LoopInspectionTask+"/modifyMaterialStatus.action";

	/**
	 * 配料任务管理列表页
	 */
	public static final String batchingTaskList = BatchingTask+"/list.action";

	/**
	 * 配料任务管理详情页：模具
	 */
	public static final String batchingTaskDetailList = BatchingTask+"/unitList.action";

	/**
	 * 配料任务管理物资明细列表页
	 */
	public static final String batchingWzDefine = BatchingTask+"/detailList.action";

	/**
	 * 配料任务管理物资：一般物资编辑
	 */
	public static final String batchingComEdit = BatchingTask+"/normalModify.action";

	/**
	 * 配料任务管理物资：配料完成
	 */
	public static final String batchingDone = BatchingTask+"/completeBatching.action";

	/**
	 * 配料任务管理物资：设备表
	 */
	public static final String batchingDeviceList = BatchingTask+"/equipmentList.action";

	/**
	 * 配料任务管理：绑定设备
	 */
	public static final String bindDevice = BatchingTask+"/bindEquipment.action";

	/**
	 * 配料任务管理物资：重要物资扫码
	 */
	public static final String batchingValueWzSweep = BatchingTask+"/sweepCode.action";

	/**
	 * 配料任务管理物资：重要物资详情列表
	 */
	public static final String batchingValueWzList = BatchingTask+"/scanList.action";

	/**
	 * 配料任务管理物资：重要物资删除
	 */
	public static final String batchingValueWzDelete = BatchingTask+"/deleteMaterial.action";

	/**
	 * 配送任务管理列表
	 */
	public static final String deliveryTaskList = DeliveryTask+"/taskList.action";

	/**
	 * 配送任务：开始配送
	 */
	public static final String startDelivery = DeliveryTask+"/startDistribution.action";

	/**
	 * 配送任务详情
	 */
	public static final String deliveryTaskDetail = DeliveryTask+"/deliveryTaskDetails.action";

	/**
	 * 配料单列表
	 */
	public static final String batchingList = Batching+"/list.action";

	/**
	 * 配料单详情列表
	 */
	public static final String batchingDetailList = Batching+"/unitList.action";

	/**
	 * 缺料单列表
	 */
	public static final String shortageList = Shortage+"/list.action";

	/**
	 * 缺料单详情
	 */
	public static final String shortageDetail = Shortage+"/detailList.action";

	/**
	 * 生成采购计划
	 */
	public static final String createProcurement = Shortage+"/createProcurement.action";

	/**
	 * 配送单管理列表
	 */
	public static final String deliveryList = Delivery+"/list.action";

	/**
	 * 配送单详情
	 */
	public static final String deliveryDetailList = Delivery+"/deliveryTaskDetails.action";

	/**
	 * 状态查询
	 */
	public static final String getState = Login+"/dictList.action";

	/**
	 * 扫码识物
	 */
	public static final String sweepSw = "apiSweep/listByCode.action";

	/**
	 * 扫码签收：获取图片
	 */
	public static final String getPic = "apiSweep/getMaterialImage.action";

	/**
	 * 扫码签收：查询
	 */
	public static final String  signSearch= ScanSign+"/batchingList.action";

	/**
	 * 扫码签收：签收
	 */
	public static final String signSign = ScanSign+"/sign.action";


    //public static Map<String,String> getHeader(){
    //    Map<String,String> heads=new HashMap<>();
    //    heads.put("isClient","android");
    //    heads.put("token", SPUtils.get("token",""));
    //    heads.put("Cookie", "JSESSIONID="+SPUtils.get("JSESSIONID",""));
    //    return heads;
    //}

}
