package cases;

import java.util.HashMap;
import java.util.ArrayList;

public class MedicalCheckupWithoutDBMethod {
    public String methodCheckUp(String in) {
        String list = "";
        try {
            ArrayList<HashMap> CheckList = new ArrayList<HashMap>();
            HashMap<String, String> info = new HashMap<String, String>();

            info.put("Name", "홍길동 ");
            info.put("Gender", "남 ");
            info.put("Age", "30 ");
            info.put("Height", "175 ");
            info.put("Weight", "75 ");
            info.put("BloodPressure", "120/80 ");
            info.put("BloodSugar", "90 ");
            info.put("Result", "비정상 ");
            info.put("Recheck", "폐암,갑상선 질환 ");
            info.put("Maintenancepan", " ");
            CheckList.add(info);

            info = new HashMap<String, String>();
            info.put("Name", "김영희 ");
            info.put("Gender", "여 ");
            info.put("Age", "25 ");
            info.put("Height", "165 ");
            info.put("Weight", "55 ");
            info.put("BloodPressure", "110/70 ");
            info.put("BloodSugar", "85 ");
            info.put("Result", "비정상 ");
            info.put("Recheck", "간암, 뇌졸증");
            info.put("Maintenancepan", " ");
            CheckList.add(info);

            info = new HashMap<String, String>();
            info.put("Name", "박철수 ");
            info.put("Gender", "남 ");
            info.put("Age", "45 ");
            info.put("Height", "180 ");
            info.put("Weight", "85 ");
            info.put("BloodPressure", "130/85 ");
            info.put("BloodSugar", "100 ");
            info.put("Result", "정상 ");
            info.put("Recheck", "심장질환 ");
            info.put("Maintenancepan", "식습관 개선, 운동 계획");
            CheckList.add(info);

            info = new HashMap<String, String>();
            info.put("Name", "이지은 ");
            info.put("Gender", "여 ");
            info.put("Age", "25 ");
            info.put("Height", "165 ");
            info.put("Weight", "60 ");
            info.put("BloodPressure", "115/75 ");
            info.put("BloodSugar", "95 ");
            info.put("Result", "비정상 ");
            info.put("Recheck", "간암, 알츠하이머병 ");
            info.put("Maintenancepan", " ");
            CheckList.add(info);

            info = new HashMap<String, String>();
            info.put("Name", "최민호 ");
            info.put("Gender", "남 ");
            info.put("Age", "28 ");
            info.put("Height", "170 ");
            info.put("Weight", "70 ");
            info.put("BloodPressure", "125/80 ");
            info.put("BloodSugar", "92 ");
            info.put("Result", "정상 ");
            info.put("Recheck", "간암");
            info.put("Maintenancepan", " ");
            CheckList.add(info);

            for (HashMap<String, String> MedicalCheckUp : CheckList) {
                System.out.println(MedicalCheckUp.get("Name") + MedicalCheckUp.get("Gender") + MedicalCheckUp.get("Age")
                        + MedicalCheckUp.get("Height")
                        + MedicalCheckUp.get("Weight")
                        + MedicalCheckUp.get("BloodPressuer")
                        + MedicalCheckUp.get("BloodSugar")
                        + MedicalCheckUp.get("Result")
                        + MedicalCheckUp.get("Recheck")
                        + MedicalCheckUp.get("Maintenancepan"));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return list;
    }
}
