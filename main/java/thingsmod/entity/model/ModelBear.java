package thingsmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBear extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer BackRightLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer Butt;
    public ModelRenderer Body;

    public ModelBear() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 10.0F, -16.0F);
        this.Head.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F);
        this.LeftEar = new ModelRenderer(this, 26, 0);
        this.LeftEar.mirror = true;
        this.LeftEar.setRotationPoint(0.0F, 10.0F, -16.0F);
        this.LeftEar.addBox(2.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 50, 22);
        this.BackRightLeg.setRotationPoint(-4.5F, 14.0F, 6.0F);
        this.BackRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
        this.Body = new ModelRenderer(this, 39, 0);
        this.Body.setRotationPoint(-2.0F, 9.0F, 12.0F);
        this.Body.addBox(-4.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.Butt = new ModelRenderer(this, 0, 19);
        this.Butt.setRotationPoint(-2.0F, 9.0F, 12.0F);
        this.Butt.addBox(-5.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F);
        this.setRotateAngle(Butt, 1.5707963267948966F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 44);
        this.Snout.setRotationPoint(0.0F, 10.0F, -16.0F);
        this.Snout.addBox(-2.5F, 1.0F, -6.0F, 5, 3, 3, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 50, 40);
        this.FrontRightLeg.setRotationPoint(-3.5F, 14.0F, -8.0F);
        this.FrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 50, 22);
        this.BackLeftLeg.setRotationPoint(4.5F, 14.0F, 6.0F);
        this.BackLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 50, 40);
        this.FrontLeftLeg.setRotationPoint(3.5F, 14.0F, -8.0F);
        this.FrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
        this.RightEar = new ModelRenderer(this, 26, 0);
        this.RightEar.setRotationPoint(0.0F, 10.0F, -16.0F);
        this.RightEar.addBox(-4.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.LeftEar.render(f5);
        this.BackRightLeg.render(f5);
        this.Body.render(f5);
        this.Butt.render(f5);
        this.Snout.render(f5);
        this.FrontRightLeg.render(f5);
        this.BackLeftLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.RightEar.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
